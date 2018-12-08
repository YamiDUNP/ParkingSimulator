int trigPin=11;
int echoPin=12;
long duration,cm;


void setup() {
  Serial.begin(9600);
  pinMode(trigPin,OUTPUT);
  pinMode(echoPin,INPUT);
}

void loop() {
  digitalWrite(trigPin,LOW);
  delayMicroseconds(5);
  digitalWrite(trigPin,HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin,LOW);

  pinMode(echoPin,INPUT);
  duration=pulseIn(echoPin,HIGH);

  
  cm=(duration/2)*(0.0343);
  if(cm<5){
    Serial.print(cm);
    Serial.print("cm");
    Serial.println();
  }
  delay(250);
}
