package spouts;

import java.util.Map;

import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.IRichSpout;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Values;
import org.apache.storm.utils.Utils;

@SuppressWarnings({ "serial", "rawtypes" })
public class HelloWorldSpout implements IRichSpout {

	Map config;
	TopologyContext topologyContext;
	SpoutOutputCollector outputCollector;

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

		// sleep for 5 sec
		Utils.sleep(5000);

		outputCollector.emit(new Values("Hello"));

	}

	public void open(Map config, TopologyContext topologyContext, SpoutOutputCollector outputCollector) {

		this.config = config;
		this.topologyContext = topologyContext;
		this.outputCollector = outputCollector;

	}

	public void declareOutputFields(OutputFieldsDeclarer declarer) {

		declarer.declare(new Fields("Hello"));

	}

	public Map<String, Object> getComponentConfiguration() {

		return null;
	}

}
