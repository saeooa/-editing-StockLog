# StockLog


![Image](https://github.com/user-attachments/assets/ba32c498-19cc-4de2-9c6c-ddc725dfdeb7)
## 프로젝트 소개
**주식 매매 일지 시스템: 스톡로그**
</br>
: 청년층의 주식 투자 참여 증가에 주목하여, 금융과 프로그래밍 개발을 기반으로 주식 매수·매도 기록과 현재 수익률을 관리할 수 있는 일지형 시스템을 개발하는 프로젝트
</br></br>

## 📅 개발 기간
2024년 1월 6일 ~ 2024년 1월 16일
</br></br>

## ⚙ 개발 환경
![windows](https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white)
![mac](https://img.shields.io/badge/mac%20os-000000?style=for-the-badge&logo=apple&logoColor=white)
![github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)
![notion](https://img.shields.io/badge/Notion-%23000000.svg?style=for-the-badge&logo=notion&logoColor=white)
![mysql](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
![intellij idea](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
</br>


## 🛠 주요 기능


![Image](https://github.com/user-attachments/assets/73bde540-25ae-42d5-909a-f3c759af6391)
## 🧩 전체 기능 요약

| 기능 구분 | 세부 설명 |
|-----------|-----------|
| 🔐 로그인 / 회원가입 | 사용자 인증 기능 |
| 📈 지수 차트 출력 | KOSPI / KOSDAQ |
| ➕ 관심 종목 추가 | 실시간 종목 관리 |
| 📋 보유 주식 확인 | 매도 주식 수익률 계산 |
| 💰 수익률 확인 | 매수/매도 내역 기반 수익률 확인 |
| 📒 주식 매매 일지 | 주식 거래 기록 저장 및 수정 |
| 📊 종목 시세 정보 | 종가, 시가, 저가 비교 차트 |
| 📰 종목 뉴스 정보 | 키워드 및 카테고리 기반 뉴스 조회 |


![Image](https://github.com/user-attachments/assets/3662dd29-6825-4a11-b9cf-ead21653f594)

![Image](https://github.com/user-attachments/assets/a7893b7b-bfe4-46ab-8ec3-527ee3b9caca)
![Image](https://github.com/user-attachments/assets/c89bd978-76fd-4a69-ab60-543774f02564)
![Image](https://github.com/user-attachments/assets/5ed9303f-18f2-476d-9243-72d1bbc5d393)


### 2️⃣ 테이블로 데이터 출력

#### 📌 DB 연동
JDBC를 통해 로컬 DB에 저장된 매매 정보를 불러와 `JTable`에 출력합니다.

- ✅ `DefaultTableModel` 기반 테이블 구성
- ✅ 사용자 매수/매도 기록 조회
- ✅ SQL 쿼리 기반 데이터 처리

**📂 관련 클래스**  
`Panel2Action.java`
</br>
![Image](https://github.com/user-attachments/assets/76846f61-a648-4a66-8961-4bc45b283c96)
![Image](https://github.com/user-attachments/assets/b5028772-669f-4494-b53d-30dde0921c0e)

#### 🌐 API 연동
금융위원회 주식 시세 정보 OpenAPI를 호출하여 실시간 종목 정보를 테이블로 출력합니다.

- ✅ HTTP 요청 / 응답 처리
- ✅ 종목별 시세 및 증감률 확인
- ✅ `JTable`로 시각화

**📂 관련 클래스**  
`SI_Panel4Action.java`
</br>
![Image](https://github.com/user-attachments/assets/8d4d5570-80ec-4121-891b-244fdc48b965)
![Image](https://github.com/user-attachments/assets/0c963b0d-b9ab-418e-9cf1-de3ec851fd55)
![Image](https://github.com/user-attachments/assets/83e73585-610d-4125-8d89-a928917e39ba)
![Image](https://github.com/user-attachments/assets/0f570e37-0093-4535-95c9-a125a92d9db5)
![Image](https://github.com/user-attachments/assets/5fc63524-9e76-4879-bdb7-ebb8735749a1)
![Image](https://github.com/user-attachments/assets/60665a75-6019-4edc-9fe4-9a393dce1d5e)
