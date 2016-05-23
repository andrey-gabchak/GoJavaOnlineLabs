package ua.goit.Practice5.Task3;

/**
 * Created by coura on 23.05.2016.
 *
 * Знайти число в бінарному дереві пошуку і повернути true якщо воно присутнє,
 * інакше повернути false.
 */

public class BSTSearch {
    public boolean exist(TreeNode root, int target) {
        if (root == null)
            return false;
        if (root.value == target)
            return true;
        if (root.value > target)
            return exist(root.left, target);
        else
            return exist(root.right, target);
    }
}


class TreeNode {
    int value;
    TreeNode left, right; //If add getters and setters then task doesn't approve

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
