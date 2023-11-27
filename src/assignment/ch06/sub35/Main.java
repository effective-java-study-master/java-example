package assignment.ch06.sub35;

public class Main {
    public static final int RESULT_CD_200 = 200;
    public static final String RESULT_CD_TEXT_200 = "OK";

    public static final int RESULT_CD_201 = 201;
    public static final String RESULT_CD_TEXT_201 = "Created";

    public static final int RESULT_CD_202 = 202;
    public static final String RESULT_CD_TEXT_202 = "Accepted";

    public static final int RESULT_CD_400 = 400;
    public static final String RESULT_CD_TEXT_400 = "Bad Request";

    public static final int RESULT_CD_401 = 401;
    public static final String RESULT_CD_TEXT_401 = "Unauthorized";

    public static final int RESULT_CD_404 = 404;
    public static final String RESULT_CD_TEXT_404 = "Not Found";

    public static final int RESULT_CD_409 = 409;
    public static final String RESULT_CD_TEXT_409 = "Conflict";

    public static final int RESULT_CD_422 = 422;
    public static final String RESULT_CD_TEXT_422 = "Unprocessable Entity";

    public static final int RESULT_CD_500 = 500;
    public static final String RESULT_CD_TEXT_500 = "Internal Server Error or Unknown Error";

    public static void main(String[] args) {

        System.out.println("Result Code : " + RESULT_CD_200);
        System.out.println("Result Text : " + RESULT_CD_TEXT_200);
    }
}
