public interface APIInterface{
    void didCancel();

    double didFailed(String reason);

    double didReceiveResults();
}