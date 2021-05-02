package project.ml;

import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.HistogramTrace;

public class DataProcessing {
	public static void main(String args[]) {
		try {
			Table bank_table=Table.read().csv("C:\\Users\\sathvika\\eclipse-workspace\\project.ml\\src\\main\\java\\project\\ml\\Predictive analytics.csv");
			System.out.println(bank_table.summary());
			System.out.println(bank_table.shape());
			
			//Histogram
			Layout layout1 = Layout.builder().title("Predictive analytics").build();
		        HistogramTrace trace1 = HistogramTrace.builder(bank_table.nCol("age")).build();
		        Plot.show(new Figure(layout1, trace1));
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
