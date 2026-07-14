# algorithms-learning-lab

Practice repository for algorithm and data-structure problems in multiple languages.

The repository currently contains Java solutions. Top-level Python folders are present so Python solutions can be added later without another reorganization.

## Repository Layout

```text
algorithms-learning-lab/
├── java/
│   ├── easy/
│   ├── medium/
│   ├── hard/
│   └── tests/
│       ├── easy/
│       ├── medium/
│       └── hard/
├── python/
│   ├── easy/
│   ├── medium/
│   └── hard/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## Organization Rule

- Primary filesystem organization is by `language -> difficulty`.
- Topic mapping is maintained in this README instead of being enforced in the directory tree.
- This keeps the repo shallow and avoids arguments about whether a problem belongs to arrays, graphs, DP, or multiple topics.

## Current Status

| Language | Easy | Medium | Hard |
|---|---:|---:|---:|
| Java | 37 | 59 | 20 |
| Python | 0 | 0 | 0 |

## Topic Index

This index is for browsing and revision. A problem may reasonably fit more than one topic, so treat these as study tags rather than strict ownership.

### Arrays / Hashing

- Easy: `TwoSum`, `ConcatenationOfArray`, `ContainsDuplicate2`, `MajorityElements`, `MergeSortedArray`, `MonotonicArray`, `MoveZeros`, `PascalTriangle`, `RemoveDuplicatesFromSortedArray`, `SquareSumOfSortedArray`
- Medium: `GroupAnagrams`, `MaxSubArray`, `NextPermutation`, `RandomizedSet`, `RotateArray`, `SortColors`, `StringCompression`, `ThreeSum`, `TopKFrequentElements`
- Hard: `Candy`, `MaxSumofThreeSubArrays`, `TrappingWater`

### Strings

- Easy: `ArrayStringsAreEqual`, `GoaLatin`, `LongestPrefix`, `MinMaxDiffInString`, `RomanToInteger`, `Strobogrammatic`, `SumOfStrings`, `ValidPalindrome1`, `ValidPalindrome2AtMost1Removal`, `ValidWordAbbr`
- Medium: `DecodedStringUsingReplication`, `IntegerToRoman`, `LengthOfLongestSub`, `LongestPalindrome`, `ShiftedStringGrouper`, `SimplifiedPath`, `StringToNumber`, `ZizagConversion`
- Hard: `MinWindowSubstring`, `NumberOfDistinctSubStrings`, `TextJustification`, `ValidNumber`, `ValidParanthesisAfterRemovingExtra`

### Linked List

- Easy: `MiddleOfLinkedList`, `PalindromeLinkedList`
- Medium: `AddNumberInLinkedList`, `CopyListWithRandomPointers`, `RemoveNthNodeFromList`
- Hard: `MergeKSortedLinkedLists`

### Trees / BST

- Easy: `ClosestInBST`, `DiameterOfBinaryTree`, `SumBetweenBoundsInBST`
- Medium: `BinaryTreeToSortedDoublyLinkedList`, `BinaryTreeVerticalOrder`, `BSTIterator`, `BuildTreeFromPreOderAndInorder`, `KthSmallestElement`, `LowestCommonAncestorOfTree`, `RightSideView`, `SumRootToLeafInBST`
- Hard: `BinaryTreeMaxPathSum`

### Graphs / BFS / DFS

- Easy: `NumberOfIsland`
- Medium: `ClonedGraph`, `CourseSchedule`, `EvaluateDivisionQueries`, `MazeProblem`
- Hard: `CleanRoom`, `MaxIncreasingPath`, `ShortestDistanceFromAllBuildings`, `WordLadder`

### Dynamic Programming

- Easy: `BestTimeToBuyAndSellStock1`, `ClimbStairs`
- Medium: `WordBreak`
- Hard: `MinimumTimeRequired`

### Binary Search

- Easy: `FindPeak`, `InsertPositionInSortedArray`, `KthMissingNumberInSortedArray`, `SquareRoot`
- Medium: `ExponentialPow`, `FindFirstAndLastPosition`, `PeakElement`, `SearchInRotatedArray`

### Intervals / Scheduling

- Easy: `MissingRanges`
- Medium: `MergedIntervals`, `GasStation`

### Stack / Queue

- Easy: `MovingArrayUsingQueue`, `StackUsingQueue`, `ValidParenthesis`
- Medium: `BasicCalculator2`, `NextGreaterElement2`
- Hard: `SlidingWindowMaximum`

### Backtracking / Combinatorics

- Medium: `Combination1`, `Combination2`, `SubSets`, `Strobogrammatic2`

### Heap / Priority Queue

- Medium: `KthLargestElementFinder`
- Hard: `MedianFinder`, `SlidingWindowMedian`

### Design / Data Structure

- Medium: `LRUCache`, `RandomPickIndex`, `NestedListWeightSum`

## Java Notes

- Existing Java files keep their original package declarations such as `meta.easy`, `meta.medium`, and `meta.hard`.
- The repository layout changed, but the Java package names were not refactored in this pass.
- If you later want the Maven build to match the new folder layout, that should be a separate package/import refactor.

## Adding Python Solutions

Add Python files under:

```text
python/easy/
python/medium/
python/hard/
```

Suggested naming style:

```text
python/easy/two_sum.py
python/medium/course_schedule.py
python/hard/trapping_water.py
```

## Running Java Tests

The Maven wrapper is still in the repo:

```bash
mvnw.cmd test
```

If you later want the Java build to use the new top-level `java/` layout directly, the `pom.xml` and Java package structure should be updated together.
