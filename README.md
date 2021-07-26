# DebuggerIdBug

Relevant LogCat output:

2021-07-26 10:19:28.130 9757-9757/com.doubov.fragmentidbug D/LX+++: wtf... textView?!?!? com.google.android.material.textview.MaterialTextView{c91a730 V.ED..... ......ID 0,0-0,0 #7f0801b2 app:id/wtfTextView} id:2131231154 res_id: 2131231154

R.id.wtfTextView and text.id match, which is correct.

Doing the same thing within the debugger:

![Image of debugger](https://github.com/C2H6O/DebuggerIdBug/blob/main/Screen%20Shot%202021-07-26%20at%2010.20.00%20AM.png)
