# AndroidKotlinStudy

<h4>오준석의 안드로이드 생존코딩 <코틀린편> 책의 내용을 토대로 업로드할 예정입니다.</h4>

------------

![4](https://user-images.githubusercontent.com/43715399/57342970-43ddbf00-717c-11e9-91aa-f1d941e24232.gif)

## Kotlin_Tutorial 1
> 나의 어플리케이션

### Function
- "헬로 월드"를 표시합니다.
- 버튼을 누르면 "버튼을 눌렀습니다"로 변경됩니다.

### Core Component
- TextView : 글자를 표시하는 뷰입니다.
- Button : 버튼 모양을 제공하는 뷰입니다.

------------

![BmiCalculator](https://user-images.githubusercontent.com/43715399/57494510-8fbb7000-7304-11e9-9d4d-25fd5c65ed93.gif)

## Kotlin_Tutorial 2
> BmiCalculator

### Function
- 키와 몸무게를 입력하고 결과 버튼을 누르면 다른 화면에서 비만도 결과를 문자와 그림으로 보여줍니다.
- 마지막에 입력했던 키와 몸무게는 자동으로 저장됩니다.

### Core Component
- ConstraintLayout : 제약에 따라 뷰를 배치하는 레이아웃입니다.
- Intent : 화면을 전환에 사용하고, 간단한 데이터를 전달할 수 있습니다.
- SharedPerference : 간단한 데이터를 저장할 수 있습니다.

### Library
- Anko : 인텐트, 다이얼로구, 로그 등을 구현하는 데 도움이 되는 라이브러리

------------

![StopWatch](https://user-images.githubusercontent.com/43715399/57507552-1d658280-733a-11e9-82ed-69e6ee98efd9.gif)

## Kotlin_Tutorial 3
> StopWatch

### Function
- 타이머를 시작, 일시정지하고 초기화할 수 있습니다.
- 타이머 실행 중에 랩타임을 측정하여 표시합니다.

### Core Component
- timer : 일정 시간 간격으로 코드를 백그라운드 스레드에서 실행합니다.
- runOnUiThread : 메인 스레드에서 UI를 갱신합니다.
- ScrollView : 랩타임을 표시할 때 상하로 스크롤되는 뷰를 사용합니다.
- FloatingActionButton : 머티리얼 디자인의 둥군 모양의 버튼입니다.

### Library
- 백터 드로어블 하위 호환 설정 : 안드로이드 5.0 미만에서 벡터 드로어블을 지원하는 라이브러리.
- design 라이브러리 : FloatingActionButton 등 머티리얼 디자인을 제공하는 라이브러리


------------

![WebBrowser](https://user-images.githubusercontent.com/43715399/57831767-fc48da00-77f0-11e9-9e12-47546ae7768e.gif)

## Kotlin_Tutorial 4
> MyWebBrowser

### Function
- 웹 페이지를 탐색합니다.
- 홈 메뉴를 클릭하여 첫 페이지로 옵니다.
- 메뉴에는 검색 사이트와 개발자 정보가 표시됩니다.
- 메뉴에는 검색 사이트와 개발자 정보가 표시됩니다.
- 페이지를 문자나 메일로 공유할 수 있습니다.

### Core Component
- WebView : 웹 페이지를 표시하는 뷰
- 옵션 메뉴 : 상단 툴바에 표시하는 메뉴
- 컨텍스트 메뉴 : 뷰를 롱클릭하면 표시되는 메뉴
- 암시적 인텐트 : 문자 보내기, 이메일 보내기와 같은 미리 정의된 인텐트

### Library
- Anko : 인텐트, 다이얼로그, 로그 등을 구현하는 데 도움이 되는 라이브러리
