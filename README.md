# convertYamlToCsv
YamlとCSVを相互変換するスクリプト

# 背景
csvのデータ作成をする際にヘッダなしデータの場合どのカラムがどのデータかわからない。

# 機能一覧
- yaml to csv
- csv to yaml
- template出力

## yamlにする理由
JsonToCsvでもいいが、Jsonはコメントを内部に入れることができないのでその部分で管理がしづらいと考えられる。
コメントも含められるyamlで作成する。他のフォーマットでもいいがシンプルなものがいいのでyamlとする

### yaml to csv
yaml
```
data: 
  - name: Taro
    id: 123
  - name: Jiro
    id: 456
```
変換後のcsv
```
Taro,123
Jiro,456
```

### csv to yaml
csv
```
Taro,123
Jiro,456
```
変換後のyaml
```
data: 
  - name: Taro
    id: 123
  - name: Jiro
    id: 456
```

### template出力
もともと用意していたデータのtemplateをそのまま吐き出す。
