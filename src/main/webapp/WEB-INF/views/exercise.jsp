<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전남대학교 동아리 추천 어플리케이션</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/main.css">
</head>
<body>
  <div>
  <section id = "qna">
    <div class="status mx-auto mt-5">
      <div class = "statusBar"></div>
    </div>
    <div>
      <h1 class="mx-auto mt-5 pt-4 px-4 py-4">어떤 종류의 운동을 좋아하시나요?</h1></div>
      <form action="${contextPath}/clubreco/surveysubmit2" method="post">
      <div id="answ" class="mx-auto mt-5 pt-5 px-5 py-5" >
        <input type="radio" name="selectedclub" value="ball" checked="checked">나는 공을 무서워 하지 않는다.
        <input type="radio" name="selectedclub" value="body">나는 강해지고 싶다.
        <input type="radio" name="selectedclub" value="leisure">운동을 위해서 돈을 아끼지 않는다.
      </div>
      <div id="send" class="mx-auto mt-5 pt-5 px-5 py-5">
        <input type="submit" value="제출">
        <input type="reset" value="다시입력">
        </div>
</form>
</section>
</div>
<script>
  const main = document.querySelector("#main");
  const qna = document.querySelector("#qna");
  const result = document.querySelector("#result");
  const endPoint = 4;
  
  function begin(){
    main.style.animation = "fadeOut 1s";
    setTimeout(() => {
    qna.style.animation = "fadeIn 1s";
    setTimeout(() => {
      main.style.display = 'none';
      qna.style.display = 'block';
    }, 500)
    next();
    }, 500);
    result();
  }
  

  function next(){
    var status = document.querySelector('.statusBar');
    status.style.width = (100/endPoint) * 2 + '%';
  }
</script>  
</body>

</html>