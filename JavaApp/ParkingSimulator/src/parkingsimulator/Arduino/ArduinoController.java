/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingsimulator.Arduino;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1
 */
public class ArduinoController implements SerialPortEventListener {
        SerialPort serialPort;
        boolean portState;
        /** The port we're normally going to use. */
        private static final String PORT_NAMES[] = { 
                        "/dev/tty.usbserial-A9007UX1", // Mac OS X
                        "/dev/ttyACM0", // Raspberry Pi
                        "/dev/ttyUSB0", // Linux
                        "COM1", // Windows
        };
        /**
        * A BufferedReader which will be fed by a InputStreamReader 
        * converting the bytes into characters 
        * making the displayed results codepage independent
        */
        private BufferedReader input;
        /** The output stream to the port */
        private OutputStream output;
        /** Milliseconds to block while waiting for port open */
        private static final int TIME_OUT = 2000;
        /** Default bits per second for COM port. */
        private static final int DATA_RATE = 9600;
        
        static ArrayList<StringBuffer> messages=new ArrayList();
        static public ArrayList<String> getMessages(){
            ArrayList<String> ls=new ArrayList();
            messages.forEach(e->{
                ls.add(e.toString());
            });
            return ls;
        }
        public void initialize() {
                for(int i=0;i<4;i++){
                    messages.add(new StringBuffer(i+"NE"));
                }
                portState=true;
                CommPortIdentifier portId = null;
                Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();
                //First, Find an instance of serial port as set in PORT_NAMES.
                while (portEnum.hasMoreElements()) {
                        CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
                        for (String portName : PORT_NAMES) {
                                if (currPortId.getName().equals(portName)) {
                                        portId = currPortId;
                                        break;
                                }
                        }
                }
                if (portId == null) {
                        portState=false;
                        Thread t=new Thread(){
                            public void run(){
                                while(true){
                                    try {
                                        for(int i=0;i<4;i++){
                                            double a=Math.random();
                                            messages.get(i).replace(0, messages.get(i).length(), a>0.5?i+"DA":i+"NE");
                                          //  System.out.println(messages.get(i));
                                        }
                                        Thread.sleep(2000);   
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(ArduinoController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                        };
                       
                        t.start();
                        System.out.println("Could not find COM port.");
                        return;
                }

                try {
                        // open serial port, and use class name for the appName.
                        serialPort = (SerialPort) portId.open(this.getClass().getName(),
                                        TIME_OUT);

                        // set port parameters
                        serialPort.setSerialPortParams(DATA_RATE,
                                        SerialPort.DATABITS_8,
                                        SerialPort.STOPBITS_1,
                                        SerialPort.PARITY_NONE);

                        // open the streams
                        input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
                        output = serialPort.getOutputStream();

                        // add event listeners
                        serialPort.addEventListener(this);
                        serialPort.notifyOnDataAvailable(true);
                } catch (Exception e) {
                        System.err.println(e.toString());
                        this.close();
                        System.out.println("Greska je 87");
                }
        }

        /**
	 * This should be called when you stop using the port.
	 * This will prevent port locking on platforms like Linux.
	 */
	public synchronized void close() {
		if (serialPort != null) {
			serialPort.removeEventListener();
			serialPort.close();
		}
	}

	/**
	 * Handle an event on the serial port. Read the data and print it.
	 */
        
//	public static void main(String[] args) throws Exception {
//		SerialTest main = new SerialTest();
//                
//		main.initialize();
//		Thread t=new Thread() {
//			public void run() {
//				//the following line will keep this app alive for 1000 seconds,
//				//waiting for events to occur and responding to them (printing incoming messages to console).
//				try {Thread.sleep(1000000);} catch (InterruptedException ie) {}
//			}
//		};
//		t.start();
//		System.out.println("Started");
//	}
        
        
        // lista.forEach(e->{
//                switch(e.charAt(0)){
//                    case '0':
//                        if(e.charAt(1)=='D' && e.charAt(2)=='A'){
//                        LOgika za DA
//                        }
//                        else if(e.charAt(1)=='N' && e.charAt(2)=='E'){
//                        logika za ne
//                        }
//                        break;
//                    case '1':
//                        break;
//                    case '2':
//                        break;
//                    case '3':
//                        break;
//                }
        // });

    @Override
    public void serialEvent(SerialPortEvent oEvent) {
   	if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
			try {
                            if(input.ready()){
				String inputLine=(String)input.readLine();
                                switch(inputLine.charAt(0)){
                                    case '0': messages.get(0).replace(0, messages.get(0).length(), inputLine);
                                        break;
                                    case '1': messages.get(1).replace(0, messages.get(1).length(), inputLine);
                                        break;
                                    case '2': messages.get(2).replace(0, messages.get(2).length(), inputLine);
                                        break;
                                    case '3': messages.get(3).replace(0, messages.get(3).length(), inputLine);
                                        break;
                                    default:
                                        break;
                                }
                                messages.forEach(e->{
                                    System.out.println("Poruka: "+e);
                                });
                            }
                            } catch (Exception e) {
                                  
                                System.out.println("There is noone close"+e);
                        }
		}
		// Ignore all the other eventTypes, but you should consider the other ones.
	
    }
    
}
