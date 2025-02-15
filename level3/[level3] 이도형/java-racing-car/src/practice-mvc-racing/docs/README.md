Model
- Car객체를 생성하고, position을 판별하는 메소드를 가진 CarGameModel클래스로 분리하였습니다.
Controller
- Model과 View를 상호작용하게하고, inputHandler을 사용 중 IllegalArgumentException이 발생한 상황을 대비케 하기 위한 try-catch문을 사용
View
- InputHandler와 OutputHandler를 분리하여 입출력을 관리
