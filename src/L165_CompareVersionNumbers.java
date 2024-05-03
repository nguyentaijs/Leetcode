public class L165_CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int length = Math.max(v1.length, v2.length);
        for (int i = 0; i < length; i++) {
            int v1Revision = i >= v1.length ? 0 : Integer.valueOf(v1[i]);
            int v2Revision = i >= v2.length ? 0 : Integer.valueOf(v2[i]);

            if (v1Revision > v2Revision) {
                return 1;
            } else if (v1Revision < v2Revision) {
                return -1;
            }
        }
        return 0;

    }
}

