<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Struts2-Demo</h2>
<form action="<%=request.getContextPath()%>/getFormData.action" method="post">
  <h3>用户1</h3>
  用户名：<input type="text" name="users[0].username"/><br/>
  密码：<input type="text" name="users[0].password"/><br/>
  兴趣爱好：<input type="checkbox" name="users[0].habits" value="足球">足球</input>
  <input type="checkbox" name="users[0].habits" value="篮球">篮球</input>
  <input type="checkbox" name="users[0].habits" value="羽毛球">羽毛球</input>
  <input type="checkbox" name="users[0].habits" value="乒乓球">乒乓球</input>
  <br/>
  <h3>用户2</h3>
  用户名：<input type="text" name="users[1].username"/><br/>
  密码：<input type="text" name="users[1].password"/><br/>
  兴趣爱好：<input type="checkbox" name="users[1].habits" value="足球">足球</input>
  <input type="checkbox" name="users[1].habits" value="篮球">篮球</input>
  <input type="checkbox" name="users[1].habits" value="羽毛球">羽毛球</input>
  <input type="checkbox" name="users[1].habits" value="乒乓球">乒乓球</input>
  <br/>
  <input type="submit" value="提交"/>
</form>
</body>
</html>