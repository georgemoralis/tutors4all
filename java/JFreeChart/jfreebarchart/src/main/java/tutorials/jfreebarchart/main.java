package tutorials.jfreebarchart;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RefineryUtilities;

public class main {

    private static CategoryDataset createDataset() {
        String java = "java";
        String cpp = "cpp";
        String c = "c";
        String speed = "Speed";
        String portability = "Portability";
        String userfriendly = "User Friendly";
        String easytocode = "Easy to code";
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(6.0, java, speed);
        dataset.addValue(9.0, java, portability);
        dataset.addValue(9.0, java, userfriendly);
        dataset.addValue(9.0, java, easytocode);

        dataset.addValue(7.0, cpp, speed);
        dataset.addValue(5.0, cpp, portability);
        dataset.addValue(4.0, cpp, userfriendly);
        dataset.addValue(4.0, cpp, easytocode);

        dataset.addValue(9.0, c, speed);
        dataset.addValue(5.0, c, portability);
        dataset.addValue(4.0, c, userfriendly);
        dataset.addValue(4.0, c, easytocode);

        return dataset;
    }

    public static void main(String[] args) {
        JFreeChart barChart = ChartFactory.createBarChart(
                "Programming Language Popularity",
                "Category",
                "Score",
                createDataset(),
                PlotOrientation.VERTICAL,//orientation vertical or horizontal
                true, //legend
                true, // tooltips
                false);

        ChartPanel chartPanel = new ChartPanel(barChart);

        JFrame f = new JFrame("Programming Language facts");
        f.setSize(560, 367);
        f.setContentPane(chartPanel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RefineryUtilities.centerFrameOnScreen(f);
        f.setVisible(true);
    }
}
