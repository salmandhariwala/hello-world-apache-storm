package spouts;

import java.util.Map;

import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.IRichSpout;
import org.apache.storm.topology.OutputFieldsDeclarer;

@SuppressWarnings({ "serial", "rawtypes" })
public class SampleIRichSpoutImpl implements IRichSpout {

	public void ack(Object arg0) {

	}

	public void activate() {

	}

	public void close() {

	}

	public void deactivate() {

	}

	public void fail(Object arg0) {

	}

	public void nextTuple() {

	}

	public void open(Map arg0, TopologyContext arg1, SpoutOutputCollector arg2) {

	}

	public void declareOutputFields(OutputFieldsDeclarer arg0) {

	}

	public Map<String, Object> getComponentConfiguration() {

		return null;
	}

}
