/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function (height) {
    let area = 0;
    let leftMax = 0;
    let leftAreaMax = 0;

    for (let h of height) {
        area += h;
        leftMax = Math.max(leftMax, h);
        leftAreaMax += leftMax;
    }

    let rightMax = 0;
    let rightAreaMax = 0;

    for (let i = height.length - 1; i >= 0; i--) {
        rightMax = Math.max(rightMax, height[i]);
        rightAreaMax += rightMax;
    }

    const boundingArea = height.length * leftMax;
    const leftVoid = boundingArea - leftAreaMax;
    const rightVoid = boundingArea - rightAreaMax;
    return boundingArea - leftVoid - rightVoid - area;
};