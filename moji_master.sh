 unzip -p 福岡.xlsx xl/sharedStrings.xml | grep -o '<si>.*</si>' | sed 's/<\/si>/&\n/g'| sed '/^$/d' | sed 's/<si><t>//' | sed 's/<.*//' | awk '{print NR-1,$1}' > moji_master