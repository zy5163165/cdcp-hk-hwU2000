package org.asb.mule.probe.ptn.u2000V16.sbi.mgrhandler;

import globaldefs.ProcessingFailureException;

import java.util.Vector;

import TopoManagementManager.NodeIterator_IHolder;
import TopoManagementManager.NodeList_THolder;
import TopoManagementManager.Node_T;
import TopoManagementManager.TopoMgr_I;

public class TopoMgrHandler {

	private static TopoMgrHandler instance;

	public static TopoMgrHandler instance() {
		if (null == instance)
			instance = new TopoMgrHandler();

		return instance;
	}

	public Node_T[] retrieveAllTopNodes(TopoMgr_I topoMgr) throws ProcessingFailureException {
		Vector<Node_T> topoNodes = new Vector<Node_T>();
		int how_many = 500;
		NodeList_THolder nodeList = new NodeList_THolder();
		NodeIterator_IHolder nodeIterator_iHolder = new NodeIterator_IHolder();
		topoMgr.getTopoSubnetworkViewInfo(how_many, nodeList, nodeIterator_iHolder);
		for (int i = 0; i < nodeList.value.length; i++) {
			topoNodes.add(nodeList.value[i]);
		}

		if (nodeIterator_iHolder.value != null) {
			boolean hasMore;
			do {
				hasMore = nodeIterator_iHolder.value.next_n(how_many, nodeList);

				for (int i = 0; i < nodeList.value.length; i++) {
					topoNodes.add(nodeList.value[i]);
				}
			} while (hasMore);

			try {
				nodeIterator_iHolder.value.destroy();
			} catch (Throwable ex) {

			}
		}
		Node_T[] nodes = new Node_T[topoNodes.size()];
		topoNodes.copyInto(nodes);
		return nodes;
	}
}
