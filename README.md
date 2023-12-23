# 概要
顧客データに関するCRUD処理のREAD機能に特化したREST APIを実装しました。  
また、存在しないIDをリクエストした時の例外ハンドリングも実装してみました。


# 動作確認
* GET（全件取得）

```curl --location 'http://localhost:8080/clients```

![get](https://github.com/minori-oya/task9/assets/138114043/664c4baf-7c0c-44bd-9a94-0d6d5b14571a)

* GET{id}（特定のID情報を取得）

```curl --location 'http://localhost:8080/clients/2```

![id2](https://github.com/minori-oya/task9/assets/138114043/32fb3780-e08d-49af-bd13-b473980f043e)

* GET{id}（存在しないIDをリクエストした時の例外処理）

```curl --location 'http://localhost:8080/clients/99```

![id99](https://github.com/minori-oya/task9/assets/138114043/a3de3070-d07e-4f3e-a4ce-396cd2944858)

* MySQLのデータベース
<img width="404" alt="databases" src="https://github.com/minori-oya/task9/assets/138114043/9432e7c4-ea6e-43b8-a15a-4e1072850f7e">

* clientsテーブル
<img width="453" alt="client_list" src="https://github.com/minori-oya/task9/assets/138114043/7823f3d5-89df-4388-b7da-a9dd4991238d">

