import java.util.*;

// 1 . Дана строка sql-запроса "select * from students where ".
//  Сформируйте часть WHERE этого запроса, используя StringBuilder. 
//  Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class Task01_02HOME {
  public static void main(String[] args) {
    Map<String, String> map = new LinkedHashMap<>();
    map.put("name", "Ivanov");
    map.put("country", "Russia");
    map.put("city", "Moscow");
    map.put("age", null);
    map.put("education", "higher education");
    System.out.println(createRequest(map));
  }

  public static String createRequest(Map<String, String> params) {
    StringBuilder people = new StringBuilder();
    for (Map.Entry<String, String> entry : params.entrySet()) {
      if ((entry.getKey() != null) && (entry.getValue() != null)) {
        if (people.toString().equals("")) {
          people.append(entry.getKey());
          people.append(" = ");
          people.append(entry.getValue());
        } else {
          people.append(" , ");
          people.append(entry.getKey());
          people.append(" = ");
          people.append((entry.getValue()));
        }
      } else {
        people.append((""));
      }
    }
    return people.toString();
  }
}

