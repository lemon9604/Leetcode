# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def revert(self, root):
        tmp = root.left
        root.left = root.right
        root.right = tmp

    def match(self, root1, root2):
        if root1 is None and root2 is None:
            return True
        elif root1 is None or root2 is None:
            return False
        elif root1.val != root2.val:
            return False

        if not self.match(root1.left, root2.left):
            self.revert(root1)
            if self.match(root1.left, root2.left) and self.match(root1.right, root2.right):
                return True
        elif self.match(root1.right, root2.right):
            return True

        return False

    def flipEquiv(self, root1, root2):
        """
        :type root1: TreeNode
        :type root2: TreeNode
        :rtype: bool
        """
        return self.match(root1, root2)

def stringToTreeNode(input):
    input = input.strip()
    input = input[1:-1]
    if not input:
        return None

    inputValues = [s.strip() for s in input.split(',')]
    root = TreeNode(int(inputValues[0]))
    nodeQueue = [root]
    front = 0
    index = 1
    while index < len(inputValues):
        node = nodeQueue[front]
        front = front + 1

        item = inputValues[index]
        index = index + 1
        if item != "null":
            leftNumber = int(item)
            node.left = TreeNode(leftNumber)
            nodeQueue.append(node.left)

        if index >= len(inputValues):
            break

        item = inputValues[index]
        index = index + 1
        if item != "null":
            rightNumber = int(item)
            node.right = TreeNode(rightNumber)
            nodeQueue.append(node.right)
    return root


def main():
    import sys
    import io
    def readlines():
        for line in io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8'):
            yield line.strip('\n')

    lines = readlines()
    while True:
        try:
            line = next(lines)
            root1 = stringToTreeNode(line);
            line = next(lines)
            root2 = stringToTreeNode(line);

            ret = Solution().flipEquiv(root1, root2)

            out = (ret);
            print(out)
        except StopIteration:
            break


if __name__ == '__main__':
    main()