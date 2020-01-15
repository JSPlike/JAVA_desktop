# JavaStudy_0116


## 자바 산술 연산자

- 종류
1. 증감연산자
2. 비교연산자
3. 논리연산자

### 증감연산자
```
  int num = 1;
  num++; // 줄이 넘어간 후에 num값 1증가
  ++num; // 줄이 넘어가기 전에 num값 1증가
  
  
  int num = 1;
  System.out.println("num++ = " + num++); // num++ = 1
  //여기서 값이 1증가되어져 넘어간다.
  System.out.println("++num = " + ++num); // ++num = 3
  
```

### 비교연산자
- 두 값을 비교하여 True, False등으로 나타낼 수 있다.

```
  int n1 = 10;
  int n2 = 20;
  
  System.out.println("n1 > n2 ? " + n1>n2); // False
  System.out.println("n1 < n2 ? " + n1<n2); // True
  System.out.println("n1 == n2 ? " + n1==n2); // False
  System.out.println("n1 != n2 ? " + n1!=n2); // True
```

### 논리연산자
- boolean데이터 타입에 적용되며 &&, &, ||, | 등이 있다.

```
  int a = 20;
  int b = 30;
  int c = 0;
  // a != b 이므로 오른쪽 a / b를 수행하지 않고 바로 False를 출력
  System.out.println((a == b) && ((a / c) > 0));
  // a != b 이지만 &연산자는 오른쪽 식까지 실행하게 된다.
  // 이때 정수 a를 0으로 나누려 하기 때문에 오류가 발생한다.
  System.out.println((a == b) && ((a / c) > 0));
  // a != b식이 True이므로 뒷식을 실행하지 않고 True를 출력한다.
  System.out.println((a != b) || ((a / b) > 0));
  // 앞의 내용과 같이 a != b식이 True지만 뒷식을 실행하므로 오류가 발생한다.
  System.out.println((a != b) | ((a / c) > 0));
  
```

