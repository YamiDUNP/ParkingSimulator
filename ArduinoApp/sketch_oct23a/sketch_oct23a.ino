int trigPin3=11;
int echoPin3=12;

int trigPin1=5;
int echoPin1=6;
int trigPin=7;
int echoPin=8;
int trigPin2=9;
int echoPin2=10;


long duration,cm;


void setup() {
  Serial.begin(9600);
  pinMode(trigPin,OUTPUT);
  pinMode(echoPin,INPUT);
  pinMode(trigPin1,OUTPUT);
  pinMode(echoPin1,INPUT);
  pinMode(trigPin2,OUTPUT);
  pinMode(echoPin2,INPUT);
  pinMode(trigPin3,OUTPUT);
  pinMode(echoPin3,INPUT);

}

void loop() {
  digitalWrite(trigPin,LOW);
  delayMicroseconds(5);
  digitalWrite(trigPin,HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin,LOW);

  duration=pulseIn(echoPin,HIGH);
  cm=(duration/2)*(0.0343);
  if(cm<10){
    Serial.print("0DA ");
    Serial.print(duration);
    Serial.println();
  }else{
    Serial.print("0NE");
    Serial.println();
  }
  
  digitalWrite(trigPin1,LOW);
  delayMicroseconds(5);
  digitalWrite(trigPin1,HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin1,LOW);
  duration=pulseIn(echoPin1,HIGH);
  cm=(duration/2)*(0.0343);
  if(cm<10){
    Serial.print("1DA");
    Serial.println();
  }else{
    Serial.print("1NE");
    Serial.println();
  }


  digitalWrite(trigPin2,LOW);
  delayMicroseconds(5);
  digitalWrite(trigPin2,HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin2,LOW);
  
  duration=pulseIn(echoPin2,HIGH);
  cm=(duration/2)*(0.0343);
  if(cm<10){
    Serial.print("2DA");
    Serial.println();
  }else{
    Serial.print("2NE");
    Serial.println();
  }
  
  digitalWrite(trigPin3,LOW);
  delayMicroseconds(5);
  digitalWrite(trigPin3,HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin3,LOW);
  
  duration=pulseIn(echoPin3,HIGH);
  cm=(duration/2)*(0.0343);
  if(cm<10){
    Serial.print("3DA");
    Serial.println();
  }else{
    Serial.print("3NE");
    Serial.println();
  }
  delay(250);
}
