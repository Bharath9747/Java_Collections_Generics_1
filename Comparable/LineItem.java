package Comparable;

import javax.sound.sampled.Line;

public class LineItem implements Comparable<LineItem>{
    public String line;

    public LineItem(String s) {
        this.line=s;
    }

    @Override
    public int compareTo(LineItem o) {
        return o.line.length()-this.line.length();
    }


}
