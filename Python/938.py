# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None


class Solution:
    def rangeSumBST(self, root, L, R):
        """
        :type root: TreeNode
        :type L: int
        :type R: int
        :rtype: int
        """
        rt = 0
        if root is None:
            return 0;

        if L <= root.val <= R:
            rt = rt + root.val
        if root.val > L:
            rt += self.rangeSumBST(root.left, L, R)
        if root.val < R:
            rt += self.rangeSumBST(root.right, L, R)

        return rt