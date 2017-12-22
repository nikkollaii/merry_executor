package drawer;

import bricks.Command;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.event.GraphEvent;
import edu.uci.ics.jung.visualization.VisualizationImageServer;
import edu.uci.ics.jung.visualization.decorators.EdgeShape;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;



import javax.swing.*;
import java.awt.*;
import java.util.Collection;

public interface IDrawer {
    void draw(Collection<Command> graph); //в каком виде мне будет даваться граф????

    public static void main(String [] args) {
//        DirectedSparseGraph g = new DirectedSparseGraph();
//        g.addVertex("Vertex1");
//        g.addVertex("Vertex2");
//        g.addVertex("Vertex3");
//        g.addEdge("Edge1", "Vertex1", "Vertex2");
//        g.addEdge("Edge2", "Vertex1", "Vertex3");
//        g.addEdge("Edge3", "Vertex3", "Vertex1");
//
//        VisualizationImageServer vs =
//                new VisualizationImageServer(
//                        new CircleLayout(g), new Dimension(400, 400));
//
//        vs.setBackground(Color.WHITE);
//        vs.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<Edge>());
//        vs.getRenderContext().setEdgeShapeTransformer(new Line<Node, Edge>());
//        vs.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<Node>());
//        vs.getColorModel();
////        vs.getRenderer().getVertexLabelRenderer()
////                .setPosition(Renderer.VertexLabel.Position.CNTR);
//
//        JFrame frame = new JFrame();
//        frame.getContentPane().add(vs);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
    }

}
