<div align="center">

<!-- logo -->
<img src="https://user-images.githubusercontent.com/80824750/208554611-f8277015-12e8-48d2-b2cc-d09d67f03c02.png" width="400"/>

### Project: 슬기로운 소비생활

<br/> [<img src="https://img.shields.io/badge/프로젝트 기간-2025.07.25~2025.08.24-green?style=flat&logo=&logoColor=white" />]()

</div> 

## 📝 소개
이 앱은 무조건 아끼는 절약이 아니라, '낭비를 줄이고 가치 있는, 실용성 있는 '현명한 선택'을 할 수 있게 도와주고자 합니다.

- 프로젝트 소개
- 프로젝트 화면 구성 또는 프로토 타입
- 프로젝트 API 설계
- 사용한 기술 스택
- 프로젝트 아키텍쳐
- 기술적 이슈와 해결 과정
- 프로젝트 팀원


<br />

> 화면 구성과 프로토 타입 중 원하는 것을 사용해주세요.

### ⚙️실행 방법
**STEP 1**  
`Fork -> Clone -> IntelliJ IDEA -> build.gradle -> run`  

**STEP 2**  
`/src/main/resources/`에 application.yml 파일을 생성(resources 디렉토리 부재 시 직접 생성)  

**STEP 3**  
`application.yml`에 다음 내용 추가

```properties
spring:
  application:
    name: wise-spending-life

  datasource:
    url: [Supabase url] (아래 설명)

  jpa:
    hibernate:
      ddl-auto: create  # 앱 시작 시 테이블 모두 초기화

```  
**URL**  
Supabase 에서 Organization(조직) 을 하나 만들고 그 안에서 Project 를 생성합니다.  
다른 설정은 하지 않고 `region` 을 `한국`, `비밀번호` 와 `프로젝트 이름` 을 설정해줍니다. 여기서 프로젝트 이름이 DB 라고 생각하시면 됩니다.  
만든 `프로젝트`로 들어와서 위에 `🔌Connect` 를 누릅니다.  
`Type` 을 `JDBC` 로 변경 후, 세 가지 연결 방법 중 두 번째 연결 방법에 있는 url 을 복사합니다. (`jdbc:postgresql://aws어쩌고저쩌고`)  
해당 `url` 을 yml `url` 에 붙여넣고 맨 뒤에 `[password]` 자리에 프로젝트 설정 시 작성한 `비밀번호` 를 넣어줍니다.  
  
설정 끝!

<br />



### 화면 구성(수정필요)
|Screen #1|Screen #2|
|:---:|:---:|
|<img src="https://user-images.githubusercontent.com/80824750/208456048-acbf44a8-cd71-4132-b35a-500047adbe1c.gif" width="400"/>|<img src="https://user-images.githubusercontent.com/80824750/208456234-fb5fe434-aa65-4d7a-b955-89098d5bbe0b.gif" width="400"/>|

### 프로토타입(수정필요)
<img src="https://user-images.githubusercontent.com/80824750/208454673-0449e49c-57c6-4a6b-86cf-66c5b1e623dc.png">

<br />

## 🗂️ APIs(수정필요)
작성한 API는 아래에서 확인할 수 있습니다.

👉🏻 [API 바로보기](/backend/APIs.md)


<br />

## ⚙ 기술 스택
> skills 폴더에 있는 아이콘을 이용할 수 있습니다.
### Back-end
<div>
<img src="https://img.icons8.com/?size=100&id=90519&format=png&color=000000" width="80">
<img src="https://img.icons8.com/?size=100&id=A3Ulk2RcONKs&format=png&color=000000" width="80">
<img src="https://img.icons8.com/?size=100&id=JRnxU7ZWP4mi&format=png&color=000000" width="80">
</div>

### Infra
<div>
<img src="https://img.icons8.com/?size=100&id=e6uRfPIDgoXi&format=png&color=000000" width="80">
</div>

### Tools
<div>
<img src="https://img.icons8.com/?size=100&id=3tC9EQumUAuq&format=png&color=000000" width="80">
<img src="https://img.icons8.com/?size=100&id=nvtEH6DpqruC&format=png&color=000000" width="80">
</div>

<br />

## 🛠️ 프로젝트 아키텍쳐(수정필요)
![no-image](https://user-images.githubusercontent.com/80824750/208294567-738dd273-e137-4bbf-8307-aff64258fe03.png)



<br />

## 🤔 기술적 이슈와 해결 과정(수정필요)
- Stream 써야할까?
  - [Stream API에 대하여](https://velog.io/@yewo2nn16/Java-Stream-API)
- Gmail STMP 이용하여 이메일 전송하기
  - [gmail 보내기](https://velog.io/@yewo2nn16/Email-이메일-전송하기with-첨부파일)
- AWS EC2에 배포하기
  - [서버 배포하기-1](https://velog.io/@yewo2nn16/SpringBoot-서버-배포)
  - [서버 배포하기-2](https://velog.io/@yewo2nn16/SpringBoot-서버-배포-인텔리제이에서-jar-파일-빌드해서-배포하기)


<br />

## 💁‍♂️ 프로젝트 팀원(수정필요)
|Backend|Backend|Backend|
|:---:|:---:|:---:|
| ![](https://github.com/holychann.png?size=120) | ![](https://github.com/todaysunny612.png?size=120) | ![](https://github.com/higakaga.png?size=120)|
|[조성찬](https://github.com/holychann)|[최희선](https://github.com/todaysunny612)|[이동호](https://github.com/higakaga)
