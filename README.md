# JavaStudy_0116


## 자바 산술 연산자

- 종류
1. 증감연산자
2. 비교연산자
3. 논리연산자
4. 비트연산자
5. 기타연산자(대입연산자, 조건 삼항 연산자)

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

### 비트연산자
- |, &, ^, >>, << 등이 있다.

```
  int a = 2;
  int b = 5;
  
  a | b // 0010, 0101 or연산하여. 7출력
  a & b // 0010, 0101 and연산하여. 0출력
  a ^ b // XOR연산이므로 둘의 값이 다르면 1로 변환되기 때문에 0111이므로. 7출력
  a << 2 // 0010을 왼쪽으로 두번 쉬프트연산하여 1000이 된다. 8출력
  b >> 2 // 0101을 오른쪽으로 두번 쉬프트연산하여 0001. 1출력
  
```

### 기타연산자

1. 대입연산자
 - 오른쪽 값을 왼쪽의 값에 넣는다.
 
 ```
  int value = 100; // value에 100대입
  value += 20 // value(100)에 20을 더해 대입. 120
  
 ```
 2. 조건 삼항 연산자
 - if조건문을 대신할 수 있는 연산자
 
 ```
  int a = 10;
  int b = 20;
  
  a < b ? "Yes" : "No" // 앞 식의 조건이 맞으면 앞 틀리면 뒤의 값 출력
 ```
 
 ## 자바 배열의 개념
 
 - 자바 변수를 어떠한 공간에 담음으로서 메모리를 할당할 수 있다.
 
 ```
  String greeting;
  
  //메모리 주소값으로 해당 배열안의 값을 출력할 수 있다.
  greeting = new String("Hello, Java!");
 ```
 
 ### 일차원 배열과 이차원 배열
 
 1. 일차원 배열
 
 - 배열 변수명 = new 데이터 타입[배열의 길이]
 ```
  // 100개의 정수형 데이터를 저장할 수 있는 배열 객체 생성
  int scoreList[] new int[100];
  int[] scoreList = new int[100];
  
  int[] arr;
  arr = new int[5];
  arr[0] = 1;
  arr[1] = 2;
  arr[2] = 3;
  arr[3] = 4;
  arr[4] = 5;
  
  // 각 자리의 데이터 출력
  for(int i = 0; i < 5; i++) System.out.println(arr[i]);
  
  System.out.println(arr.length) // 배열의 길이 출력. 5출력
 ```
 
 2. 다차원 배열
 
 > 배열 변수명 = new 데이터 타입[배열의 배열길이][배열 길이];
   혹은
   배열 변수명[인덱스 번호] = new 데이터 타입[배열 길이];
 
 ```
  int[][] scoreList = new int[3][4];
  
  for(int i = 0; i < scoreList.length; i++){
    for(int j = 0; j < scoreList[i].length; j++){
      scoreList[i][j] = "[" + i + "][" + j "]";
      System.out.println(scoreList[i][j] + "\t");
    }
    System.out.println("\n");
  }
 ```
 
 ### 명령형 매개변수 (배열로 입력)
 
 > public static void(String args[]) //String 배열을 명령형 매개변수로 받는다.
 
 ```
  // parseInt() 등의 내장함수를 이용하여 숫자형도 사용할 수 있도록 만들어아한다.
  int a = Inteager.parseInt(10);
  double b = Inteager.parseDouble(20.0);
  
  
 ```
 
 ## 자바의 제어문
 
 ### 조건 제어문
 - 조건에 따라 선택적으로 문장이 수행되는 분기문을 수행할 수 있다.
 
 1. if-else문
 
 ```
  int num = 10;
  if((num % 2) == 0) {
    //num이 짝수일때 해당 문장 출력
    System.out.println(num + "은 짝수입니다.");
  }
  else
    //num이 홀수일때 해당 문장 출력
    System.out.println(num + "은 홀수입니다.");
 ```

2. if-else if문
- 여러조건을 순차적으로 비교할 수 있다.

```
  // 매개변수로 받은 정수를 int형으로 형변환
  int month = Integer.parseInt(args[0]);
  if(month == 3 || month == 4 || month == 5)
    System.out.println("해당 월은 봄입니다.");
  else if(month == 6 || month == 7 || month == 8)
    System.out.println("해당 월은 여름입니다.");
  else if(month == 9 || month == 10 || month == 11)
    System.out.println("해당 월은 가을입니다.");
  else if(month == 12 || month == 1 || month == 2)
    System.out.println("해당 월은 겨울입니다.");
  else
    System.out.println("잘못된 월을 입력했습니다.);
```

3. switch문
- if조건문을 switch문으로 변경하여 사용할 수 있다.

```
  int month = Integer.parseInt(args[0]);
  switch(month){
    case 3:
    case 4:
    case 5:
      System.out.println("해당 월은 봄입니다.");
      break;
    case 6:
    case 7:
    case 8:
      System.out.println("해당 월은 여름입니다.");
      break;
    case 9:
    case 10:
    case 11:
      System.out.println("해당 월은 가을입니다.");
      break;
    case 12:
    case 1:
    case 2:
      System.out.println("해당 월은 겨울입니다.");
      break;
    default:
      System.out.println("잘못된 월을 입력하였습니다.);
      break;
  }
```
