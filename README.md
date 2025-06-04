# java_question

## 프로젝트 개요

**java_question** 저장소는 Java 언어로 작성된 예제, 실습 문제, 알고리즘 풀이 등을 체계적으로 관리하는 프로젝트입니다.  
자바 문법 학습, 코딩 테스트 준비, 인터뷰 대비, 실전 문제 풀이 등 다양한 목적에 맞춰 활용합니다.

---

## 디렉토리 구조
```
java_question/
├── .idea/ # IntelliJ 프로젝트 설정 파일
├── gradle/ # Gradle 빌드 도구 관련 파일
├── wrapper/ # Gradle Wrapper 실행 파일
├── src/
│ └── main/
│ └── java/
│ └── org/
│ └── example/ # Java 소스 코드(예제, 문제 풀이 등)
├── .gitignore # Git에서 제외할 파일 목록
├── build.gradle # Gradle 빌드 설정
├── settings.gradle # Gradle 프로젝트 설정
├── gradlew # Gradle Wrapper 실행 파일(Unix)
├── gradlew.bat # Gradle Wrapper 실행 파일(Windows)
```


---

## 설치 및 실행 방법

1. 저장소 클론

    ```
    git clone https://github.com/Len-Yoon/java_question.git
    cd java_question
    ```

2. Gradle 빌드

    ```
    ./gradlew build
    ```

3. 실행  
   (실행할 클래스가 있다면 아래와 같이 실행)

    ```
    ./gradlew run
    ```

---

## 주요 활용 예시

- **Java 문법 및 핵심 개념 실습**: 클래스, 인터페이스, 예외 처리, 컬렉션 등
- **알고리즘 문제 풀이**: 정렬, 탐색, 자료구조 등
- **코딩 테스트 및 인터뷰 대비**: 자주 출제되는 문제 유형 연습
- **문제 추가 및 풀이 공유**: 새로운 문제를 추가하고 다양한 풀이법을 공유

---

## 기여 방법

- 새로운 예제나 문제를 `src/main/java/org/example` 하위에 추가
- Java 코딩 컨벤션 준수
- Pull Request 제출 시, 변경 사항과 목적을 명확하게 작성


