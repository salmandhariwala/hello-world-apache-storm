package bolts;

import java.util.Map;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.IRichBolt;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.tuple.Tuple;

@SuppressWarnings({ "serial", "rawtypes" })
public class HelloWorldBolt implements IRichBolt {

	Map config;
	TopologyContext context;
	OutputCollector outputCollector;

	public void cleanup() {

	}

	public void execute(Tuple tuple) {

		System.out.println("Got the msg in Hello World Bolt!");

		// need to ack the tuple
		outputCollector.ack(tuple);

	}

	public void prepare(Map config, TopologyContext context, OutputCollector outputCollector) {
		this.config = config;
		this.context = context;
		this.outputCollector = outputCollector;
	}

	public void declareOutputFields(OutputFieldsDeclarer declarer) {

	}

	public Map<String, Object> getComponentConfiguration() {

		return null;
	}

}
