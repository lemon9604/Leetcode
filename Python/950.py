class Solution:
    def deckRevealedIncreasing(self, deck):
        """
        :type deck: List[int]
        :rtype: List[int]
        """
        if (len(deck) == 1 or len(deck) == 0):
            return deck
        deck.sort()
        rt = [deck[len(deck) - 1]]
        for i in range(len(deck) - 2, -1, -1):
            rt = [deck[i]] + [rt[len(rt) - 1]] + rt[0:-1]
        return rt


# class Solution:
#     def deckRevealedIncreasing(self, deck):
#         """
#         :type deck: List[int]
#         :rtype: List[int]
#         """
#         from collections import deque
#
#         i = deque()
#         for c in range(len(deck)):
#             i.append(c)
#
#         ans = [None] * len(deck)
#         for card in sorted(deck):
#             ans[i.popleft()] = card
#             if i:
#                 i.append(i.popleft())
#         return ans