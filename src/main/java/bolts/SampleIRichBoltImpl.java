package bolts;

import java.util.Map;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.IRichBolt;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.tuple.Tuple;

@SuppressWarnings({ "serial", "rawtypes" })
public class SampleIRichBoltImpl implements IRichBolt {

	public void cleanup() {

	}

	public void execute(Tuple arg0) {

	}

	public void prepare(Map arg0, TopologyContext arg1, OutputCollector arg2) {

	}

	public void declareOutputFields(OutputFieldsDeclarer arg0) {

	}

	public Map<String, Object> getComponentConfiguration() {

		return null;
	}

}
