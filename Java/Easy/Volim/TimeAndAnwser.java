public class TimeAndAnwser
{
    private String anwser = "";
    private int time = 0;

    public TimeAndAnwser(int time, String anwser)
    {
        this.anwser = anwser;
        this.time = time;
    }

    String getAnwser()
    {
        return anwser;
    }

    int getTime()
    {
        return time;
    }
}
