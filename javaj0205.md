## 객체지향

지역변수와 멤버변수
> 함수에 만든 변수는 항상 초기화를 해주어야한다.

> 그러나 멤버변수로 만들어진 객체는 자동으로 초기화가 이뤄지기 때문에 에러가 없다.


### 자바 객체

오버로드 : 함수의 이름은 같고 인자가 서로 다른 함수를 생성한다.

default Constructor!
```
 class Profile(){
  Profile(){}
 }
 Profile(String name, int no, boolean gendor, int age){
 }
```

### this

> this는 메소드 안에서만 사용할 수 있으며,,
> this가 가리키는 메소드는 this이다.
