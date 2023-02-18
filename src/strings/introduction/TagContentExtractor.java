package src.strings.introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

  final static String regex = "(\\<.+?\\>)";


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    while (testCases > 0) {
      String result = "";
      String line = in.nextLine();
      generateResult(line, result);
      testCases--;
    }

  }

  private static String getLine(String closed, String open, String value) {
    return value.substring(getIndex(open), getIndex(closed));
  }

  private static Integer getIndex(String value) {
    return Integer.parseInt(value.substring(value.indexOf("_") + 1));
  }

  private static String getTag(String value) {
    return value.substring(0, value.indexOf("_"));
  }

  private static boolean checkTags(List<String> allMatches) {
    List<String> open = new ArrayList<>();
    List<String> close = new ArrayList<>();

    allMatches.forEach(e -> {
      if (e.startsWith("</")) {
        close.add(e.replace("/", ""));
      } else {
        open.add(e);
      }
    });

    if (open.size() != close.size()) {
      return false;
    }

    for (String s : open) {
      if (Collections.frequency(open, s) != Collections.frequency(close, s)) {
        return false;
      }
    }
    return true;
  }

  private static void generateResult(String line, String result) {
    List<String> allMatchesWithIndex = new ArrayList<>();
    List<String> allMatches = new ArrayList<>();

    Matcher m = Pattern.compile(regex).matcher(line);
    while (m.find()) {
      String value = m.group();
      allMatches.add(value);
      allMatchesWithIndex.add(String.format("%s_%s", value, m.start()));
    }
    if (!checkTags(allMatches)) {
      System.out.println("None");
      return;
    }

    for (int i = 0; i < allMatchesWithIndex.size() - 1; i++) {
      String firstTag = getTag(allMatchesWithIndex.get(i));
      String secondTag = getTag(allMatchesWithIndex.get(i + 1));
      if (secondTag.contains("/") && firstTag.equals(secondTag.replace("/", ""))) {
        String localResult = getLine(allMatchesWithIndex.get(i + 1), allMatchesWithIndex.get(i),
            line).substring(firstTag.length());
        line = line.replace(firstTag + localResult + secondTag, "");
        if (localResult.length() != 0) {
          result += (localResult + "\n");
        }
        break;
      }
    }
    if (line.length() == 0) {
      System.out.print(result);
    } else {
      generateResult(line, result);
    }
  }
}




/*
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
 */


