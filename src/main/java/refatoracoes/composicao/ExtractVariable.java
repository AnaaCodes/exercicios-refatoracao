package refatoracoes.composicao;

public class ExtractVariable {

    void renderBanner(String platform, String browser, int resize) {
        boolean isMacOs = platform != null && platform.toUpperCase().contains("MAC");
        boolean isInternetExplorer = browser != null && browser.toUpperCase().contains("IE");
        boolean isResized = resize > 0;

        if (isMacOs && isInternetExplorer && wasInitialized() && isResized) {
            // do something
        }
    }

    private boolean wasInitialized() {
        return false;
    }
}
