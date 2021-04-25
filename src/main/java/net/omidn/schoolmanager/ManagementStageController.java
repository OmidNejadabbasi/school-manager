package net.omidn.schoolmanager;

import javafx.fxml.FXML;
import javafx.geometry.NodeOrientation;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.util.List;
import java.util.stream.Collectors;

public class ManagementStageController {

    @FXML
    public TreeView treeView;

    public void initialize() {
        TreeItem<String> rootItem = new TreeItem<>("Class 9");
        rootItem.setExpanded(true);
        treeView.setRoot(rootItem);
        treeView.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
        rootItem.getChildren().addAll(List.of("Class 1", "Class 2").stream().map(TreeItem::new).collect(Collectors.toList()));



    }

}
