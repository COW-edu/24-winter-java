# 온보딩

### 1. 객체지향 프로그래밍이란?

 객체 지향 프로그램은 영문으로 Object-Oriented Programming(OOP)이라고 합니다. 또한 쉽게 설명하면 여러가지 독립적인 부품들을 조합시킨 것을 말하며 각 객체들의 유기적인 협력과 결합으로 파악하고자 하는 컴퓨터 프로그래밍의 패러다임을 의미합니다. 자동차로 예시를 들면 수많은 부품들을 객체라고 하면 그 부품들을 결합하여 하나의 완전한 자동차 즉 프로그램을 만드는 것과 같습니다.  


### 2. 객체지향 프로그래밍의 장, 단점

장점 : 객체지향 프로그램은 객체 단위로 프로그램을 구성하기 때문에 복잡성을 관리하기에 용이합니다. 또한 객체는 재사용이 가능하여 개발의 효율성을 높일 수 있습니다. 

단점 : 다른 프로그램에 비해서 학습 난이도가 높다는 점이 단점입니다. 또한 메모리 사용량이 많아서 성능이 저하될 수 있는 단점이 있습니다.


### 3. 절차지향과 객체지향의 차이

 절차지향은 데이터를 순차적으로 처리하는 방식을 취하고 있습니다. 그리고 객체 지향 프로그램은 데이터와 그 데이터를 처리하는 함수를 하나의 객체로 묶어서 관리하는 방식이라는 차이점이 존재합니다. 


### 4. 클래스와 객체

- 클래스란?
 
  유사한 특징을 지닌 객체들의 속성을 묶어 놓은 집합체


- 객체란?

  클래스의 인스턴스


- 클래스와 객체의 차이
  
  유사한 객체들의 모임이 클래스 즉 객체는 클래스의 부품이면 클래스는 그 부품을 통한 완전품입니다.


- 인스턴스란?

  클래스의 구체적인 구현

### 5. 추상화란?
 복잡한 자료, 모듈, 시스템 등으로부터 핵심적인 개념 또는 기능을 간추려 내는 것


abstract class Human{
public String country;
public abstract void greetings();

}

class Korean extends Human{

    public Korean(){

       this.country = "대한민국";}

    public void greetings(){
        
        System.out.println("안녕하세요");
}
}

class Japanese extends Human{

    public Japanese(){

       this.country = "일본";}

    public void greetings(){

        System.out.println("곤니치와");
}
}

### 6. 캡슐화란?

-데이터와 데이터를 처리하는 행위를 묶고 외부에는 이 행위를 보여주지 않는 것


- 적절한 접근 제어자를 사용해야 하는 이유-> 필드와 매서드를 하나로 묶어 관리하고 외부에는 필요한 메서드만 제동하여 정보 은닉을 실현하기 때문입니다.

class Capsule {
    int num;

    public Capsule(int num){
        this.num = num;}

    public int getNum(){
        return num;}
}

public class Main {
    

    public static void main(String[] args) {
        Capsule C = new Capsule(10);
        System.out.println(C.getNumber());}}

### 7.  상속이란?

   부모 클래스의 맴버를 자식 클래스에게 물려주는 것

class Point{

    private int x,y;
    public Point() {
        this.x=this.y=0; }
    public Point(int x, int y) {
        this.x = x;
        this.y = y; }

    public void showPoint() {
        System.out.println("("+x+","+y+")");}}

class ColorPoint extends Point{

    private String color;
    public ColorPoint1(int x,int y,String color) {
        super(x,y);
        this.color = color;}

    public void showColorPoint(){
        System.out.print(color);
        showPoint();}}

### 8. 다형성이란?

 같은 자료형에 여러 가지 객체를 대입하면 다양한 결과를 얻어내는 성질

interface Person{
    
    void eat;
    void sleep;}

class EomSeoWon implements Person{

    public void eat(){
        System.out.println("BBQ 황금올리브를 먹는다.");}
    
    public void sleep(){
        System.out.println("7시간 잔다.")}
}

### 9. 객체지향적 설계 원칙 (SOLID)

Single Responsibility Principle(단일 책임 원칙)
    
    하나의 클래스는 하나의 기능 담당하여 하나의 책임을 수행하는데 집중되도록 클래스를 따로따로 여러개를 설계하라는 원칙

Open Closed Principle(개방 폐쇄 원칙)

    클래스는 확장에 열려있어야 하며 수정에는 닫혀있어야 한다는 원칙


Liskov Substitution Principle(리스코프 치환 원칙)

    서브 타입은 언제나 부모 타입으로 교체할 수 있어야 한다는 원칙


Interface Segregation Principle(인터페이스 분리 원칙)

    인터페이스를 각각 사용에 맞게 끔 잘게 분리해야한다는 설계원칙    

Dependency Inversion Principle(의존 역전 원칙)

    어떤 클래스를 참조할 때 그 대상의 상위 요소로 참조하라는 원칙   
 

### 10. 인터페이스와 추상클래스

- 인터페이스란?

    인터페이스는 interface 키워드를 사용하여 정의하며 오직 추상 메서드와 상수만을 가지고 있는 것입니다.



- 추상클래스란?

    추상클래스는 클래스 앞에 abstract 키워드를 사용하여 정의를 하며 하나 이상의 추상 메서드를 가지고 있거나 abstract로 정의가 된 클래스를 말합니다.


- 인터페이스와 추상클래스 차이점

    추상클래스는 그 추상클래스를 상속받아서 기능을 이용하고 확장시키는 데 있지만 인터페이스는 함수의 구현을 강제함으로써 구현 객체의 같은 동작을 보장할 수가 있습니다. 즉 둘의 존재 목적이 다릅니다.



### 10. 클린 코드란 무엇이며, 지켜야할 점들이 어떤 것들이 있는가?
   클린 코드는 읽기 쉽고 이해하기가 쉬운 코드를 작성하는 것입니다. 또한 이를 위해서 지켜야 할 점은 변수와 함수는 그 사용 문맥에 맞게 명확하게 명명되어야 하고 다른 사람이나 자신이 나중에 읽기 쉽게 작성이 되어야 합니다.  