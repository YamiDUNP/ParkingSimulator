int trigPin=11;
int echoPin=12;

int trigPin1=5;
int echoPin1=6;
int trigPin2=7;
int echoPin2=8;
int trigPin3=9;
int echoPin3=10;


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
  digitalWrite(trigPin1,LOW);
  digitalWrite(trigPin2,LOW);
  digitalWrite(trigPin3,LOW);
  delayMicroseconds(5);
  digitalWrite(trigPin,HIGH);
  digitalWrite(trigPin1,HIGH);
  digitalWrite(trigPin2,HIGH);
  digitalWrite(trigPin3,HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin,LOW);
  digitalWrite(trigPin1,LOW);
  digitalWrite(trigPin2,LOW);
  digitalWrite(trigPin3,LOW);

  pinMode(echoPin,INPUT);
  pinMode(echoPin1,INPUT);
  pinMode(echoPin2,INPUT);
  pinMode(echoPin3,INPUT);
  duration=pulseIn(echoPin,HIGH);
  cm=(duration/2)*(0.0343);
  if(cm<10){
    Serial.print("0DA");
    Serial.println();
  }else{
    Serial.print("0NE");
    Serial.println();
  }
  
  duration=pulseIn(echoPin1,HIGH);
  cm=(duration/2)*(0.0343);
  if(cm<10){
    Serial.print("1DA");
    Serial.println();
  }else{
    Serial.print("1NE");
    Serial.println();
  }
  
  duration=pulseIn(echoPin2,HIGH);
  cm=(duration/2)*(0.0343);
  if(cm<10){
    Serial.print("2DA");
    Serial.println();
  }else{
    Serial.print("2NE");
    Serial.println();
  }
  
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
