## 자바의 상속

1. 부모 클래스
2. 자식 클래스

> 자식 클래스에서 부모 클래스의 멤버변수나 메서드를 가져와 사용할 수 있다.

```
  class Employee {
    String name;
    int age;
    int e_num;
    String address;
    int dept;
  }
  
  class Manager extends Employee{ // Employee클래스의 변수들을 가져와 사용할 수 있다.
    String jobmanage;
    String boss;
  }
```

> 부모 클래스와 겹치는 내용은 상속받아와서 사용하고 겹치지않는 내용은 자체적으로 선언하여 사용할 수 있다.
> 논리적으로 is ~ a 관계가 성립했을 시 이를 상속관계라고 한다.
> 논리관계가 성립하지 않을 경우 유지보수가 어려울 수 있다.
