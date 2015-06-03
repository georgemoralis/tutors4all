package tutorials.jfreepie;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.RefineryUtilities;

public class main {

    private static PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Java", new Double(40));
        dataset.setValue("C++", new Double(30));
        dataset.setValue("C", new Double(20));
        dataset.setValue("Pascal", new Double(10));
        return dataset;
    }

    private static JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Programming Language Popularity", // chart title 
                dataset, // data    
                true, // include legend   
                true,//tooltips
                false);

        return chart;
    }

    public static JPanel createDemoPanel() {
        JFreeChart chart = createChart(createDataset());
        return new ChartPanel(chart);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Programming Language Popularity");
        f.setSize(560, 367);
        f.setContentPane(createDemoPanel());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RefineryUtilities.centerFrameOnScreen(f);
        f.setVisible(true);
    }
}
