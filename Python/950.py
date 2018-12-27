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