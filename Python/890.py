class Solution:
    def findAndReplacePattern(self, words, pattern):
        """
        :type words: List[str]
        :type pattern: str
        :rtype: List[str]
        """
        rt = []
        already = []
        for word in words:
            if len(word) != len(pattern):
                continue
            match = {}
            for i in range(len(word)):
                if pattern[i] not in match:
                    match[pattern[i]] = word[i]
                    # if word[i] not in already:
                    already.append(word[i])
                elif word[i] != match[pattern[i]]:
                    break
                if i == len(word)-1:
                    i += 1
            if i == len(word) and len(already) == len(list(set(already))):
                rt.append(word)
            already.clear()
        return rt

words = ["a","b","c"]
pattern = "a"
print(Solution.findAndReplacePattern(Solution, words, pattern))