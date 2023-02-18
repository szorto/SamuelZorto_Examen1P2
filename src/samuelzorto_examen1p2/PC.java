package samuelzorto_examen1p2;

public class PC {
    protected String ip, mark, host;

    public PC() {
    }

    public PC(String ip, String mark, String host) {
        this.ip = ip;
        this.mark = mark;
        this.host = host;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "ip: " + ip + "\nmark: " + mark + "\nhost: " + host + "\n";
    }
    
    
    
    
}
