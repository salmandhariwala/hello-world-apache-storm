package topologies;

import org.apache.storm.Config;
import org.apache.storm.LocalCluster;
import org.apache.storm.generated.StormTopology;
import org.apache.storm.topology.TopologyBuilder;
import org.apache.storm.utils.Utils;

import bolts.HelloWorldBolt;
import spouts.HelloWorldSpout;

public class HelloWorldTopology {

	public static void main(String args[]) throws Exception {

		String topoloyName = "HelloWorldTopology";
		String spoutName = "helloWorldSpout";
		String boltName = "helloWorldBolt";

		// declare config
		Config stormConfig = new Config();

		// create topology
		HelloWorldSpout helloWorldSpout = new HelloWorldSpout();
		HelloWorldBolt helloWorldBolt = new HelloWorldBolt();

		TopologyBuilder topologyBuilder = new TopologyBuilder();
		topologyBuilder.setSpout(spoutName, helloWorldSpout);
		topologyBuilder.setBolt(boltName, helloWorldBolt).shuffleGrouping(spoutName);

		StormTopology topology = topologyBuilder.createTopology();

		// declare cluster
		LocalCluster cluster = new LocalCluster();

		// submit topology
		cluster.submitTopology(topoloyName, stormConfig, topology);

		// shutdown the cluster
		Utils.sleep(60000);
		cluster.shutdown();

	}

}
