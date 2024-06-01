import java.util.ArrayList;
import java.util.List;

interface StringChecker { boolean checkString(String s); }

class ListExamples {

  // Returns a new list that has all the elements of the input list for which
  // the StringChecker returns true, and not the elements that return false, in
  // the same order they appeared in the input list;
  static List<String> filter(List<String> list, StringChecker sc) {
    for(String s: list) {
      if(sc.checkString(s)) {
        List<String> result = new ArrayList<>();
        result.add(s);
      }
      return;
    }
    return result;
  }



}
