import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jxl.Workbook;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;


@WebServlet(name = "ExcelServlet")
public class ExcelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

    OutputStream out = null;
        try {

        response.setContentType("application/vnd.ms-excel");

        response.setHeader("Content-Disposition",
                "attachment; filename=sampleName.xls");

        WritableWorkbook w = Workbook.createWorkbook(response.getOutputStream());
        WritableSheet s = w.createSheet("Demo", 0);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                int x = 1 + (int) (Math.random() * 100);
                s.addCell(new Number(j, i, (x * 15)));
            }
        }
        w.write();
        w.close();

    }

    }

