# ELK workpiece
Заготовка для обучения/начала работы со стеком Elasticsearch-Logstash-Kibana

JDK17
SpringBoot
Gradle


<Запуск временно сделан на встроенном Tomcat>
Работает в контейнере вебприложений, main-класса нет, класс инициализации веб-приложения - WebAppInit.
Скачать Tomcat, запустить и скопировать собранный .war в папку развертывания - в работающий Tomcat (в папку \apache-tomcat\webapps или через ui Tomcat), ИЛИ при помощи IntelliJ сконфигурировать запуск TomcatLocal->указать свой Tomcat и артефакт в проекте - как main-класс выступает класс инициализации веб-приложения WebAppInit.

Добавить расположение logback-spring.xml в vm-options:
-Dlogging.config=file:src/main/resources/logback-spring.xml
Active profiles установить dev или staging или те, которые есть в logback-spring.xml

Вкл. stack-trace, если надо:
-Dlogging.level.org.springframework=TRACE


Роадмапы по компонентам ELK:
Инструкции для установки на Debian11 (написал процессе установки)
ELK_installation.md

Примеры работы с компонетами:
Examples_for_Elasticsearch.md

NGINX_instruction - для проброски с портов хоста на локальные порты инструментов.

МР - в ветку dev. 