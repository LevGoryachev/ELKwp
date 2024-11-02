
Example of Elasticsearch's user account: 
username: elastic
password: abc12345

Elasticsearch, если запущен, работает внутри localhostа сервера, на порту 9200
(во вне желательно пробросить с помощью Nginx)


Создание индекса exp_index1

curl -XPUT -k -u elastic:abc12345 https://localhost:9200/exp_index1/ -H "Content-Type: application/json" -d '{ "mappings":{"properties": {"title":{"type": "text"},	"price":{"type": "integer"}, "qty":{"type": "integer"}}}}'


Создание индекса exp_index2

curl -XPUT -k -u elastic:abc12345 https://localhost:9200/exp_index2/ -H "Content-Type: application/json" -d '{ "mappings":{"properties": {"title":{"type": "text"},	"price":{"type": "integer"}, "qty":{"type": "integer"}}}}'


Создание индекса exp_index3

curl -XPUT -k -u elastic:abc12345 https://localhost:9200/exp_index3/ -H "Content-Type: application/json" -d '{ "mappings":{"properties": {"name":{"type": "text"}, "surname":{"type": "text"}, "middlename":{"type": "text"}}}}'

Проверить какие индексы есть:
curl -k -u elastic:abc12345 https://localhost:9200/_cat/indices?v


Создание документов в индексе м

id = 1
curl -XPUT -k -u elastic:abc12345 https://localhost:9200/exp_index1/_doc/1 -H "Content-Type: application/json" -d '{"title":"book", "price":50, "qty":17}'

id = 2
curl -XPUT -k -u elastic:abc12345 https://localhost:9200/exp_index1/_doc/2 -H "Content-Type: application/json" -d '{"title":"teremok", "price":75, "qty":11}'

id = 15
curl -XPUT -k -u elastic:abc12345 https://localhost:9200/exp_index1/_doc/15 -H "Content-Type: application/json" -d '{"title":"car", "price":101, "qty":18}'

id = 17
curl -XPUT -k -u elastic:abc12345 https://localhost:9200/exp_index1/_doc/17 -H "Content-Type: application/json" -d '{"title":"plane", "price":15250, "qty":5}'


Получение всех по индексу exp_index1
curl -XGET -k -u elastic:abc12345 https://localhost:9200/exp_index1/_search






