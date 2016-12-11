Сервлеты. Java API. Работа с XML
================================

Разбор домашнего задания.

JSP-страница -> java-файл сервлета -> *.class
---------------------------------------------
* Исходная страница **list.jsp** 
* Tomcat или другой сервер приложений генерирует файл
 **list_jsp.java** сервлет.
* Сервлет компилируется в **.class** файл 
* Вызывается метод **_jspService** 
 * javax.servlet.http.HttpServletRequest request - запрос от браузера 
 * javax.servlet.http.HttpServletResponse response - записываем ответ

Жизненный цикл сервлета. Filter, ServletListener.

Структурированное хранение данных
---------------------------------
json, xml, Xsd, Xslt, xPath



Аннотации

Java API: JAXB, StAX, XPath. Сохранение данных приложения в XML.


Домашнее задание 
----------------
* Разобраться с Atomic + volatile
* Реализовать редактирование Section/TimeSection.
* Поставить клиента PostgreSql: SQL Manager Freeware (full installation package) или pgAdmin 

