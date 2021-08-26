# Study Springboot Android

## 소개
안드로이드 화면에서 rest api를 가지고와 화면에 보여주는 기능 
  
### Repo구조
TestNetwork : 안드로이드 파일  
kotlin_gradle_demo_spring_rest : 스프링부트 파일  

## 간략과정
1. 스프링부트로 만든 REST API를 헤로쿠(PaaS)로 배포
2. 안드로이드에서 retofit2, corutine을 이용하여 rest api를 가져온후 textview에 표시 

## 이미지
![](https://github.com/hj3437/study_springboot_android/blob/main/captures/image.png?raw=true)


## REST API URL
접속시 (heroku free 버전) 약 30초의 시간이 필요 할 수 있습니다.   
https://desolate-gorge-14146.herokuapp.com/user/readUserList
