# ELK workpiece
Заготовка для обучения/начала работы со стеком Elasticsearch-Logstash-Kibana

JDK17
SpringBoot
Gradle

Работает в контейнере вебприложений, main-класса нет, класс инициализации веб-приложения - WebAppInit.
Скачать Tomcat, запустить и скопировать собранный .war в папку развертывания - в работающий Tomcat (в папку \apache-tomcat\webapps или через ui Tomcat), ИЛИ при помощи IntelliJ сконфигурировать запуск TomcatLocal->указать свой Tomcat и артефакт в проекте - как main-класс выступает класс инициализации веб-приложения WebAppInit.


Инструкции для установки на Debian11 (написал процессе установки)
elastic_installation
Logstash_installation  - добавлю позднее.
Kibana_installation - добавлю позднее.

NGINX_instruction - для проброски с портов хоста на локальные порты инструментов.

МР - в ветку dev. 